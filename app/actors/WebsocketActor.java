
package actors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;


public class WebsocketActor extends UntypedActor {

	//Tao ra Prop - thuc chat la configuration class - thang ActorRef la bat bien, serializable - co the freelt shared among message by message passing.
    public static Props props(ActorRef out) {
        return Props.create(WebsocketActor.class, out);
    }

    @SuppressWarnings("unused")
	private final ActorRef out;

    // tao ra 1 Map chua List 
    private static Map<String, ArrayList<ActorRef>> map1 = new HashMap<String, ArrayList<ActorRef>>();
    // cach tao khac
    //final ActorRef other = getContext().actorOf(Props.create(OtherActor.class), "childName");

    // tao ra khi method static Props khoi tao
    public WebsocketActor(ActorRef out) {
        this.out = out;
        this.addSocketCon("10",out);
    }

    // duoc goi tu constructor ben tren
    @SuppressWarnings("static-access")
	public synchronized void addSocketCon(String id, ActorRef con){

    	ArrayList<ActorRef> itemsList = this.map1.get(id);

    	if(itemsList == null) {
	         itemsList = new ArrayList<ActorRef>();
	         itemsList.add(con);
	         this.map1.put(id, itemsList);
	    } else {
	        // add if item is not already in list
	        if(!itemsList.contains(con)) itemsList.add(con);
	    }

    }

    // extend UntypedActor thi buoc phai extends method nay - de nhan message
    // khi da khoi tao dc connect, thi tu dong se goi den onReceive de truyen, nhan message tu client
    @SuppressWarnings("static-access")
	public void onReceive(Object message) throws Exception {
        if (message instanceof String) {

            //out.tell("I received your message: " + message, self());
            ArrayList<ActorRef> itemsList = this.map1.get("10");
            for (int i = 0; i < itemsList.size(); i++) {
				ActorRef out1=itemsList.get(i);
				out1.tell( message +"-", self());
			}
        }
    }
}