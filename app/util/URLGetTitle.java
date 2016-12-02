/**
 * 
 */
package util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeVisitor;

/**
 * @author mac_thieu
 *
 */
public class URLGetTitle {

	public static String getTitle(String url) throws IOException {

		List<String> strings = getStringsFromUrl(url, "");
		String title = "";
		System.out.println(strings.size());
		if (!strings.isEmpty()) {
			for (String string : strings) {
				title += string;
			}
		} else
			return "";
		return title;

	}

	private static List<String> getStringsFromUrl(String url, String cssQuery) throws IOException {
		List<String> strings = new ArrayList<String>();
		if (isValid(url)) {
			Document document = Jsoup.connect(url).get();
			Elements elements = StringUtil.isBlank(cssQuery) ? document.getElementsByTag("title")
					: document.select(cssQuery);
			elements.traverse(new TextNodeExtractor(strings));
		}
		return strings;
	}

	public static String getImageUrl(String url, String tem) throws IOException {
		if (isValid(url)) {
			Document document = Jsoup.connect(url).get();
			Elements elements = document.getElementsByTag("img");
			for (Element element : elements) {
				String text = element.attr("src");
				if (text.contains("http"))
					return text;
			}
		}
		return "";
	}

	private static class TextNodeExtractor implements NodeVisitor {
		private final List<String> strings;

		public TextNodeExtractor(List<String> strings) {
			this.strings = strings;
		}

		@Override
		public void head(Node node, int depth) {
			if (node instanceof TextNode) {
				TextNode textNode = ((TextNode) node);
				String text = textNode.getWholeText();
				if (!StringUtil.isBlank(text)) {
					strings.add(text);
				}
			}
		}

		@Override
		public void tail(Node node, int depth) {
		}
	}

	private static boolean isValid(Object object) throws IOException {
		if (!(object instanceof String)) {
			return false;
		}
		final String urlString = (String) object;

		final URL url = new URL(urlString);
		final HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();

		final int code = huc.getResponseCode();
		return code != 404;
	}
}
