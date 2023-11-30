# История
# Домашнее задание 1

Выберите какой-нибудь проект на изучаемом вами языке программирования, с которым вы будете тренироваться работать в Git, и инициализируйте в папке этого проекта локальный репозиторий.
Создайте непустой удалённый репозиторий (например, с файлом README.md) с именем, соответствующим имени этого проекта.
Подключите свой проект к этому удалённому репозиторию и отправьте в него код этого проекта. Самостоятельно разрешите конфликты и проблемы, если они возникнут при выполнении данного задания.
````bash
4 git remote -v
5 git remove origin
6 git remote remove origin
7 git remote add origin https://github.com/Ignasiya/git-HM.git
8 git remote -v
9 git push
10 git pull origin main
11 git push -u origin main
12 git remote -v
13 git fetch --all
14 git log origin/main ^main
15 git merge origin/main
16 git pull origin main --allow-unrelated-histories
17 git add .
18 git commit -am "сделал"
19 git push
````
# Домашнее задание 2

Данное домашнее задание является продолжением домашнего задания, которое вы выполняли на предыдущем семинаре в репозитории с собственным проектом.

1. Просмотрите историю коммитов в своём проекте и выберите три случайных коммита. Просмотрите изменения, которые были в них сделаны.

2. Верните эти изменения командой git revert последовательно, чтобы в итоге получилось тоже три коммита.

3. Попробуйте отменить эти три коммита:
* последний — командами git reset --soft и git restore;
* предпоследний — командой git reset --mixed и git restore;
* первый — командой git reset --hard.

````bash
 2 git logg
 3 git log
 4 git diff
 5 git revert e4c2824006
 6 git revert e4c2824006 --continue
 7 git revert --continue e4c2824006
 8 git log
 9 git revert 044d43f
10 git add .
11 git commit -am "commit"
12 git revert 044d43f
13 git revert --continue
14 git log
15 git commit -am "commit"
16 git log
17 git revert fb22e129b166bf259ec5193c087acd39533d7729
18 git commit -am "commit"
19 git log
20 git log --online --all
21 git log --oneline --all
22 git reset soft 93a550a
23 git reset --soft 93a550a
24 git status
25 git restore --staged Data.json
26 git reset --mixed 29bdb8d
27 git reset --hard 4e09d84
28 git log --oneline --all
````
