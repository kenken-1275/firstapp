--gradleファイルにDB作成用のライブラリ導入後に、schema.sqlを作成し下記内容の記述を行う。
--postsテーブルを作成している。
CREATE TABLE IF NOT EXISTS posts (
--idカラムの作成(BIGINTが型、NOTNULL制約と、主キー設定、AUTO_INCREMENTは自動で数字を上げていってくれる設定)
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
--memoカラムの作成(VARCHAR型、NOTNULL制約設定。)
    memo VARCHAR(256) NOT NULL
);