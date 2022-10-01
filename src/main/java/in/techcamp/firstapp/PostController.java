package in.techcamp.firstapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller //アノテーション Springにそのクラスがコントローラーであることを伝えるためのもの。
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;
    @GetMapping("/hello") //アノテーション　railsのルーティング的な役割。ルートパス/helloというパスに行ったら下記メソッドを実行する。GetはHTTPメソッドのこと、そのためPostMappingもある。
    public String showHello(Model model) { //Model型のオブジェクトを用意して、データを追加してビューに渡す。ビューに渡すためにModel型を定義している。
        var sampleText = "サンプルテキスト"; //変数を定義
        model.addAttribute("sampleText", sampleText); //addAttributeでmodelに要素を追加している。1つ目の引数がビューで読み込む際の名称、2つ目の引数が直前の変数を表している。
        return "hello"; //この記述でresourcesフォルダのtemplatesフォルダに作成したhello.htmlを読み込める。
    }
    @GetMapping  //@GetMapping("/")と同じ意味。ルートパスの時は省略できる。
    public String showList(Model model){
        var postList = postRepository.findAll();//PostRepositoryのfindAllメソッド実行結果をpostListに代入。
        //List.of( //この記述で、3件のデータを作成している。List.ofは文字通りリストを作成するメソッド。
//                new PostEntity(1,"投稿1"), //PostEntityクラスのオブジェクトを3つ作成している。
//                new PostEntity(1,"投稿2"),
//                new PostEntity(1,"投稿3")
//        );
        model.addAttribute("postList",postList);//作成したオブジェクトをmodelに追加している。
        return "index";
    }

    @GetMapping("/postForm")
    //@ModelAttribute("呼び出す時の名称") 保存したい変数のデータ型 保存したい変数　　このアノテーションで任意のデータをmodel型のオブジェクト(一時保管場所のような)に格納できる。
    //下記で、PostForm型の変数formを登録し、後にpostFormという名称で呼び出すことができる。
    public String showPostForm(@ModelAttribute("postForm") PostForm form){
        return "postForm";
    }
}
