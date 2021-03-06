package com.commafeed.frontend.references.angularui;

import java.util.Arrays;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.Url;
import org.apache.wicket.request.resource.UrlResourceReference;

import com.commafeed.frontend.references.angular.AngularReference;

public class AngularUIReference extends UrlResourceReference {
	private static final long serialVersionUID = 1L;

	public static final AngularUIReference INSTANCE = new AngularUIReference();

	private AngularUIReference() {
		super(
				Url.parse("https://cdnjs.cloudflare.com/ajax/libs/angular-ui/0.4.0/angular-ui.min.js"));
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterable<? extends HeaderItem> getDependencies() {
		return Arrays
				.asList(JavaScriptHeaderItem
						.forReference(AngularReference.INSTANCE),
						CssHeaderItem.forReference(new UrlResourceReference(
								Url.parse("https://cdnjs.cloudflare.com/ajax/libs/angular-ui/0.4.0/angular-ui.min.css"))));
	}

	public static void renderHead(final IHeaderResponse response) {
		response.render(JavaScriptHeaderItem.forReference(INSTANCE));
	}
}