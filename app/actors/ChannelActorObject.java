
package actors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import models.chat.ChatRoom;

public class ChannelActorObject extends UntypedActor {

	/*
	 * Cách 1: Handling với Actor: Để xử lý một WebSocket với Actor, cần đưa vào
	 * Play đối tượng akka.actor.Props là đối tượng để Play tạo ra khi nhận kết
	 * nối WebSocket. Play sử dụng akka.actor.ActorRef để gửi message từ nguồn
	 * (server), vì vậy, chúng ta có thể sử dụng nó để tạo một đối tượng Props.
	 * 
	 * Cách 2: Xử lý bằng Callback: Nếu bạn không muốn sử dụng Actor để thao tác
	 * WebSocket, bạn có thể thao tác bằng cách sử dụng Callback cũng khá đơn
	 * giản.
	 */
	public static Props props(ActorRef out) {
		return Props.create(ChannelActorObject.class, out);
	}

	@SuppressWarnings("unused")
	private final ActorRef out;
	private String channel;
	private static Map<String, ArrayList<ActorRef>> map1 = new HashMap<String, ArrayList<ActorRef>>();

	// Init channal va store new socket
	@SuppressWarnings("unused")
	public ChannelActorObject(ActorRef out) {
		String channel = "10";
		this.out = out;
		if (channel != null) {
			System.out.println("channel :: " + channel);
			this.channel = channel;
		} else {
			this.channel = "0";
		}
		this.addSocketCon(channel, out);
	}

	// Add news socket, socket se dc dinh danh bang Id ss, Nen set socket ss tu SESSION giong nhu ben duoi
	@SuppressWarnings({ "unused", "static-access" })
	public synchronized void addSocketCon(String id, ActorRef con) {
		// String ss=session("channel");
		String ss = "10";
		System.out.println("Session GET :: " + ss);
		if (channel == null) {
			ss = "0";
		}

		ArrayList<ActorRef> itemsList = this.map1.get(id);

		if (itemsList == null) {
			itemsList = new ArrayList<ActorRef>();
			itemsList.add(con);
			this.map1.put(id, itemsList);
		} else {
			// add if item is not already in list
			if (!itemsList.contains(con))
				itemsList.add(con);
		}
	}

	// Sau khisocket da được mở, thì sẽ Gửi và nhận message thông qua 
	@SuppressWarnings({ "static-access", "unused" })
	public void onReceive(Object channel) throws Exception {
		if (channel instanceof String) {
			String changelSt = channel.toString();

			JsonObject jobj = new Gson().fromJson(changelSt, JsonObject.class);
			String to = jobj.get("to").toString();
			String from = jobj.get("from").toString();
			String message = jobj.get("message").toString();

			ArrayList<ActorRef> itemsList = this.map1.get(this.channel);
			for (int i = 0; i < itemsList.size(); i++) {
				ActorRef out1 = itemsList.get(i);
				out1.tell(channel, self());
			}
		}
	}
}