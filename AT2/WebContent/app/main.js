var agentService = angular.module('agents', []);
var agenti="";
var pokrenut="";

agentService.controller('initController', function($scope, agentFactory, $location){
	
	
	$scope.init = function(){
		
		var host = $location.host() + ":" + $location.port();
		
		agentFactory.getAllAgentTypes(host).success(function(data){
			
			agenti=data;
			var agenti2=[];
			for(var i=0;i<agenti.length;i++){
				agenti2[i]=agenti[i].name;
			}
			$scope.allAgents=agenti2;
		});
	
	}
	$scope.update=function(){
		
		var host = $location.host() + ":" + $location.port();
		
		var selectBox = document.getElementById("select1");
	    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
	   // alert(selectedValue);
	    
	    for(var i=0;i<agenti.length;i++){
	    	if (selectedValue==agenti[i].name){
	    		pokrenut=agenti[i].name;
	    		addSender();
	    		addReceiver();
	    		var type=JSON.stringify({
	    	    	"name":agenti[i].name,
	    			"module":agenti[i].module
	    	    });
	    		
	    		agentFactory.startAgent(host,type,agenti[i].name).success(function(data){
	    			
	    		});
	    		break;
	    		}
	    	}

	    agentFactory.getAllRunningAgents(host).success(function(data){
			$scope.runningAgents = data;
		});
	   
	}
	
	
	$scope.sendMessage=function(){
		
		var message=JSON.stringify({
			"performative":document.getElementById("select2").options[document.getElementById("select2")].value,
			"sender":document.getElementById("selectSender").options[document.getElementById("selectSender")].value,
			"recivers":document.getElementById("selectReceiver").options[document.getElementById("selectReceiver")].value,
			"replyTo":document.getElementById("replyTo").value,
			"content":document.getElementById("content").value,
			"language":document.getElementById("language").value,
			"encoding":document.getElementById("encoding").value,
			"ontology":document.getElementById("onthology").value,
			"protocol":document.getElementById("protocol").value,
			"conversationId":document.getElementById("conversationId").value,
			"replyWith":document.getElementById("replyWith").value,
			"inReplyTo":document.getElementById("inReplyTo").value,
			"replyBy":document.getElementById("replyBy").value
		});
		$("#textarea").val(message);
		agentFactory.sendMessage(message).success(function(data){
			
		});
		
	}
	
	
	$scope.clearMessages=function(){
				
	}
	
});

var addSender=function(){
	var selectBox = document.getElementById("selectSender");
	var option = document.createElement("option");
	option.id=pokrenut;
	option.value = pokrenut;
	option.text = pokrenut;
	selectBox.appendChild(option);
	
}

var addReceiver=function(){
	var selectBox = document.getElementById("selectReceiver");
	var option = document.createElement("option");
	option.id=pokrenut;
	option.value = pokrenut;
	option.text = pokrenut;
	selectBox.appendChild(option);
	
}