// Agent facebook in project noticiasufc

+newPost(N) <-
	//acessar api facebook e publicar noticia
	.print("publicando notícia: ", N).

{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }

// uncomment the include below to have an agent compliant with its organisation
//{ include("$moiseJar/asl/org-obedient.asl") }
