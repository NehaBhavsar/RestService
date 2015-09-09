or create a new repository on the command line

echo # OCPJava >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/NehaBhavsar/OCPJava.git
git push -u origin master

…or push an existing repository from the command line


git remote add origin https://github.com/NehaBhavsar/OCPJava.git
git push -u origin master

git checkout -b b1 master ( git checkout -b <newbranch> <oldbranch>
git push -u origin b1