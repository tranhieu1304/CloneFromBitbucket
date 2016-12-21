
package actors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;


public class ChannelActor extends UntypedActor {

    public static Props props(ActorRef out) {
        return Props.create(ChannelActor.class, out);
    }

    @SuppressWarnings("unused")
	private final ActorRef out;
    private String channel;
    private static Map<String, ArrayList<ActorRef>> map1 = new HashMap<String, ArrayList<ActorRef>>();

    @SuppressWarnings("unused")
	public ChannelActor(ActorRef out) {
        String channel = "10";
        this.out = out;
        if(channel != null) {
            System.out.println("channel :: "+channel);
            this.channel = channel;
        } else {
            this.channel = "0";
        }
        this.addSocketCon(channel,out);
    }

    @SuppressWarnings({ "unused", "static-access" })
	public synchronized void addSocketCon(String id, ActorRef con){
        //String ss=session("channel");
        String ss="10";
        System.out.println("Session GET :: "+ss);
        if(ss == null){
            ss="0";
        }
        id=ss;

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

    @SuppressWarnings("static-access")
	public void onReceive(Object message) throws Exception {
        if (message instanceof String) {

            //out.tell("I received your message: " + message, self());
            ArrayList<ActorRef> itemsList = this.map1.get(this.channel);
            for (int i = 0; i < itemsList.size(); i++) {
				ActorRef out1=itemsList.get(i);
				out1.tell( message, self());
			}
        }
    }
}