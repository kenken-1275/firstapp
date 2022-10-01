//SQL操作のためのリポジトリ作成。Gitのリポジトリのことではなく、SQL操作をするためのメソッドを定義するためのもの。
//リポジトリは、インターフェースを選択する。

package in.techcamp.firstapp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostRepository {
    @Select("select * from posts") //@Select("行いたいSQL文")
    List<PostEntity> findAll(); //返り値のデータ型　メソッド名;　と記述する。
}
