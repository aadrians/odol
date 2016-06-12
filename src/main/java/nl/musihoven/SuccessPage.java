/**
 * 
 */
package nl.musihoven;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

/**
 * @author arya
 *
 */
public class SuccessPage extends WebPage {

	private static final long serialVersionUID = 3335310353887612694L;

	public SuccessPage(final PageParameters parameters){
		StringValue result = parameters.get("msg");
		if (result != null){
			add(new Label("msg", result.toString()));
		} else {
			add(new Label("msg", "Fail"));
		}
	}
}
