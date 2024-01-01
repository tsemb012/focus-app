# コードレビューのコメント
message("PRが開始されました。レビューを行います。")

# 変更されたファイルに対するチェック
warn("ビッグPRですね！") if git.lines_of_code > 500

# テストコードの確認
fail("新しいコードに対するテストが見当たりません。") if git.modified_files.include?("app/src/main/") && !git.modified_files.include?("app/src/test/")

# android_lintの実行
android_lint.gradle_task = "app:lint"
android_lint.report_file = "./reports/lint/file.xml"
android_lint.filtering = true
android_lint.lint(inline_mode: true)