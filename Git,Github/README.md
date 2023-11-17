# Git(깃의 기초만)

## Git이란?
- 파일 분산버전관리시스템(Distributed revision control, 또는 Distributed Version Control(Systems)__(DVCS)__)
- 하나의 작업을 하나의 폴더에 저장한다는 느낌
- 깃은 직전파일에서 얼마나 바뀌었냐를 관리

## Git 초기설정
터미널(git bash)에서 
```
git config --global user.email "내 이메일" 
git config --global user.name "내 아이디"
``` 
입력해준다. 이후 원하는 폴더를 git으로 열고
```
git init
```
git 폴더로 지정해준다.


## Git 업로드 하는 방법
```
git add 파일명 or 폴더명 (--all 을 하면 해당 폴더의 모든 파일이 깃에 올릴 준비가 된다.)
git commit -m "커밋내용"
```
이렇게 하면 git에 저장이 완료된다.

## Git 관리
- `git status` 는 git의 수정상태를 보여준다.
- `git log` 는 git의 커밋 로그를 보여준다. --oneline을 붙이면 간략하게 보여준다.
- 업로드를 원하지 않는 파일이 있을 경우 폴더에 .gitignore라는 파일을 만들고 업로드를 원하지 않는 파일명을 적으면 된다.
- 자신이 main인지 master인지 헷갈리면 `git config  --global init.defaultBranch main` <- 메인으로 바꿔주고 main 대신 master를 쓰면 마스터로 바꿔준다.

## Git 되돌리기

1. add전에 되돌리려면 `git restore 파일명`을 하면 원래 버전으로 파일이 되돌아간다.
2. add후 commit 전에 되돌리려면 `git restore --staged 파일명`을 하면 add 된 상태가 취소되어 1번 상태로 돌아간다.
3. commit 후 되돌리려면 `git log`에서 되돌리려는 커밋 번호를 기억했다가 `git reset 번호`를 치면 파일 상태는 그대로인데 커밋은 사라지고 add 되기 전으로 돌아간다. 하지만 앵간해서는 안쓰는게 좋고 commit 후 되돌리려는 일이 있으면 그냥 수정을 직접 하는게 낫다.

# GitHub
GitHub는 깃 호스팅 서비스이다. 비슷한 기능을 가진 서비스들이 존재한다.

## SSH 설정방법
- 내 컴퓨터 터미널에서 
```
ssh-keygen
cat ~/.ssh/id_rsa.pub
```
를 치면 ssh값이 나오는데 지금은 이게 뭐하는지는 모르겠고, 이걸 GitHub의 SSH에 넣으면 된다. 

## 업-다운 로드 방법

- 업로드
    1) 붙여넣을 폴더에서 터미널(or git bash)를 열고 `git clone 깃주소`,이후 commit까지 한 상태에서 `git push`
    2) 리포지터리 하나 만들고 주소를 복사 한 후 
    ```
    git remote add origin 깃주소 (주소 잘못쳤을 경우 git remote set-url origin 깃주소)
    git push -u origin main (or git push --set=upstream origin main)
    ```
- 다운로드
    원하는 폴더에서 `git pull`을 하면 된다.

업로드 시 git 이 충돌이 날 수 있어서 push하기 전에 pull 한번 해봐야한다.

## GitHub꾸미기
- 마크다운파일 같은거에서 링크하려면 해당 파일 기준에서 상대적인 경로를 적어서 걸어야한다.
- 내 메인페이지를 꾸미려면 리포지토리를 내 아이디와 같은 이름으로 만들면 해당 리포지토리의 README.md가 메인페이지에 걸린다. 이 README.md로 메인페이지를 꾸미면 된다.