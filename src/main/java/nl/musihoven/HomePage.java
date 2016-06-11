package nl.musihoven;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("message", "Hello world!"));
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here
		Form<?> form = new Form<Void>("userForm"){
			private static final long serialVersionUID = -1930410850159114718L;

			@Override
			protected void onSubmit(){
				System.out.println("Form submitted");
				PageParameters pageParameters = new PageParameters();
				pageParameters.add("msg", "this is parameter value");
				setResponsePage(SuccessPage.class, pageParameters);
			}
		};
		add(form);
    }
	
}
