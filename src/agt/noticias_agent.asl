// Agent sample_agent in project noticiasufc

!create.

+!create : true <-
	makeArtifact("web","noticiasufc.AmbienteWeb", [], W);
	focus(W);
	!monitorar.

+!monitorar : true <-
	loadNews;
	println("Esperando: ", (1000 * 60) / 6000, " minutos");
	.wait(5000)
	!monitorar.
	
+newPost(N) <-
	.broadcast(tell, newPost(N)).

{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have an agent compliant with its organisation
//{ include("$moiseJar/asl/org-obedient.asl") }
