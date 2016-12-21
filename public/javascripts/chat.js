
    var wsUri ;
    var output;
    var kameWebsocket;
    var to ;
    var from; 
    var email = sessionStorage.getItem('email');
    console.log(sessionStorage);
    console.log(localStorage);

   //set the default UserName
    var setUser = $('.userName').first().attr('value');
    $('.hidenUserName').attr('value',setUser)
    
    $('.userName').on('click', function(){
    	var setUser = $(this).attr('value');
    	$('.hidenUserName').attr('value',setUser)
    	kameWebsocket.close()
    	changeChatRoom("");
    	init();
    });
    // Khoi tao ket noi ban dau
    function init()
    {
      to =  $('.hidenUserName').attr('value');
      from  = $('.userHeader').attr('value');
      wsUri = "ws://localhost:9000/message/"+toUTF8Array(from).toString();
      output = $('#output');
      testWebSocket();
      
    }

    // check cac gia tri cua Websocket - khoi tao ket noi New Websocket - co cac trang thai nga ben duoi
    function testWebSocket()
    {
  
      kameWebsocket = new WebSocket(wsUri);
      kameWebsocket.onopen = function(evt) { onOpen(evt) };
      kameWebsocket.onclose = function(evt) { onClose(evt) };
      kameWebsocket.onmessage = function(evt) { onMessage(evt) };
      kameWebsocket.onerror = function(evt) { onError(evt) };
      console.log(kameWebsocket);
    }

    function onOpen(evt)
    {
      writeToScreen("... Chat with: "+to);
      console.log("Open");
      //doSend("WebSocket rocks Kame");
    }

    function onClose(evt)
    {
      writeToScreen("xxx");
      console.log("Close");
    }

    // khi nhan dc messege, van tiep tuc connect servers
    function onMessage(evt)
    {
            //adds all this values fron the array ,only from and to
    	var msg = JSON.parse(evt.data);
    	if(email == msg.to || email==msg.from){
 			writeToScreen('<span style="color: blue;">'+msg.from +' : '+ msg.message+'</span>');
    	}
 			console.log(msg.from +' : '+ msg.message);
 			console.log(msg);
      //websocket.close();
    }

    function onError(evt)
    {
      writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
      console.log("Error");
    }
    //---------------------------------------------------------------------------------------------Cac trang thai cua Websocket
    // Enter de gui tin nhan
    function sendMessageonEnter(event) {
      
      if(event.which == 13 || event.keyCode == 13){
          sendMessage();
      }
      else{
          return false; // returning false will prevent the event fraom bubbling up.
      }
    }

    function sendMessage()
    {
      var messageOb=document.getElementById('message-area');
      var message= messageOb.value;
      kameWebsocket.send(JSON.stringify({
    	  from : from,
    	  to 	: to,
    	  message: message
    	}));
      messageOb.value='';
      messageOb.focus();
    }

    function doSend(message)
    {
      writeToScreen("First Sent: " + message);
      kameWebsocket.send(JSON.stringify({
    	  from : from,
    	  to 	: to,
    	  message: message
    	}));
    }

    function writeToScreen(message)
    {
      var pre = document.createElement("p");
      pre.style.wordWrap = "break-word";
      pre.innerHTML = message;
      output.append(pre);
    }
    // reload thay vi empty message
    function changeChatRoom(roomName){
    	output.empty();
    }

    window.addEventListener("load", init, true);
    
    
    function toUTF8Array(str) {
        var utf8 = "";
        for (var i=0; i < str.length; i++) {
            var charcode = str.charCodeAt(i);
            utf8 = utf8+charcode;
        }
        return utf8;
    }
    
