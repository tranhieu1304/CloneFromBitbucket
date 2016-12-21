package controllers;

import actors.ChannelActorObject;
import actors.WebsocketActor;
import helpers.Secured;
import models.User;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.Session;
import play.mvc.LegacyWebSocket;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.WebSocket;

@SuppressWarnings("deprecation")
@Security.Authenticated(Secured.class)
public class ChatController extends Controller {
	public Result ws() {
		System.out.println("Get up");
		return ok(views.html.socket.render());
	}

	public Result wsChannel() {
		System.out.println("Get up");
		return ok(views.html.chanelSocket.render(User.findAll()));
	}

	@SuppressWarnings("deprecation")
	public LegacyWebSocket<String> socket() {
		return WebSocket.withActor(WebsocketActor::props);
	}

	// @SuppressWarnings("deprecation")
	// public LegacyWebSocket<String> channel(String channel) {
	// session("channel", channel);
	// Session session = Http.Context.current().session();
	// session.put("channel", channel);
	//// ActorRef channelizer =
	// Akka.system().actorOf(Props.create(ChannelActor.class));
	//// return WebSocket.withActor(ChannelActor::props);
	// String ss=session("channel");
	// System.out.println("Session GET :: "+ss);
	// return WebSocket.withActor(ChannelActor::props);
	// }
	@SuppressWarnings({ "deprecation", "unused" })
	public LegacyWebSocket<String> channel(String channel) {
		Session sessionCurrent = Http.Context.current().session();
		String ss = session("username");
		System.out.println("Session GET :: " + ss);
//		ActorRef channelizer = Akka.system().actorOf(Props.create(ChannelActor.class));
//		return WebSocket.withActor(ChannelActor::props);

		 return WebSocket.withActor(ChannelActorObject::props);
	}
}
