# DXCLearning-
## Gitの勉強をされている方こちらでpush,pullやコード、テストをブランディングしたり、編集したり、色々なコマンドを試してみてください。

## Gitの状況
    git status

## gitにコード追加コマンド →
    git add .
    git commit -m "編集したり内容をタイトルとして書いてください"
    git push

## git分岐コマンド →
    git checkout -b "分岐の名前"
    git add .
    git commit -m "編集したり内容をタイトルとして書いてください"
    git push --set-upstream origin Readme-Update
    
## git 分岐を変えるコマンド（違うブランチに飛ぶなど）
    git branch (ブランチのリストを表示するため)
    git switch ブランチの名前　(""不要です。)