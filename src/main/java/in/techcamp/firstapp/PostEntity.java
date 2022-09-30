package in.techcamp.firstapp;

public class PostEntity {//idとmemoカラムに対応するようエンティティを作成する。
    private long id;
    private String memo;

    public PostEntity(long id, String memo) { //コンストラクタの設定。command+nで簡単に作成できる。（IntelliJの場合は）
        this.id = id;
        this.memo = memo;
    }

    public long getId() {//ゲッターとセッターの設定。これもcommand+nから作成できる。
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
