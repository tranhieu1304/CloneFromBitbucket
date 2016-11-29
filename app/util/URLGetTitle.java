/**
 * 
 */
package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
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
		String title = "";
		if (!url.isEmpty()) {
			List<String> strings = getStringsFromUrl(url, null);
			for (String string : strings) {
				title = string + "-";
			}
		}
		return title;
	}

	private static List<String> getStringsFromUrl(String url, String cssQuery) throws IOException {
		Document document = Jsoup.connect(url).get();
		Elements elements = StringUtil.isBlank(cssQuery) ? document.getElementsByTag("title")
				: document.select(cssQuery);

		List<String> strings = new ArrayList<String>();
		elements.traverse(new TextNodeExtractor(strings));
		return strings;
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
}
