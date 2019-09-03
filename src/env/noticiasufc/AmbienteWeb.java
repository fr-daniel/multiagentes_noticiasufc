// CArtAgO artifact code for project noticiasufc

package noticiasufc;

import java.io.IOException;
import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import cartago.*;

public class AmbienteWeb extends Artifact {
	
	void init(int initialValue) {
	}

	@OPERATION
	void loadNews() {
		WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions().setCssEnabled(false);
        client.getOptions().setUseInsecureSSL(true);
                
        try {
			HtmlPage page = client.getPage("https://www.quixada.ufc.br/category/noticia/");
			List<DomNode> elements = page.querySelectorAll("div[class^='post-']");
			for (DomNode domNode : elements) {
				
			String titulo = domNode.querySelector("h3 a").getTextContent();
			
			signal("newPost", titulo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

