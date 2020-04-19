import com.peterchiu.HMMChineseTokenizer;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
  public static void main(String[] args) throws IOException {
    HMMChineseTokenizer chinese = new HMMChineseTokenizer();
    Reader input = new StringReader("腾讯视频\n" +
      "资讯视频\n" +
      "上海雀巢\n" +
      "雀巢（上海）有限公司\n" +
      "帝斯曼\n" +
      "晶泰 晶体" +
      "百佳\n" +
      "惠康\n");
    chinese.setReader(input);
    chinese.reset();
    while (chinese.incrementToken())
      System.out.println(chinese.cloneAttributes());
    chinese.end();
  }
}
// todo
/*
duplicate
empty lines
comment
symbols
 */
