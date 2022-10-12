public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        git config --global user.name ""
        git config --global user.email
        git config --list

        git init
        git add .  /or/  git add "necessary file"
        git commit -m "commit description"
        git remote add origin "repository path"
        git push -u origin <master>  - выгрузить в ветку облака

        git clone adress

        git pull  -  обновление проекта с облака
        ///////////////////////////////////////////////////////
        Lesson 6 - Aliases

        заходим в .gitconfig path: C:\Users\CurrentUser
        [alias]
             ....Переопределяем команды
             s = status --short
             и т.д.
        ///////////////////////////////////////////////////////
        Lesson 7

        git checkout -- path. - возврат до последнего необновленного состояния конкретного файла
        git checkout -- .    -  откат всего

        В случае, если файл уже был добавлен add
        1.1 git reset --hard <HEAD^1>
        1.2 git reset --soft <HEAD^1>            1.1 and 1.2 if a commit was made
        1.3 git reset .                          1.3 if files have been added
          1.3.1 git checkout -- . - Откат всего
          1.3.2 git checkout -- path. - возврат до последнего необновленного состояния конкретного файла
       //////////////////////////////////////////////////////////
         Lesson 8 - Branch
         git branch - current branch
         git branch -v  current br + latest commit
         git branch newBranch - create one more branch
         git checkout newBranch - switch between branches

         faster method: git co -b branchName  - create new branch and permanently switch into
             * */

        System.out.println("some new");
    }

}
