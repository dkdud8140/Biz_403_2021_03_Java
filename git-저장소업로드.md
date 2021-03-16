# git repository(저장소)업로드 하기
## 원격저장소
* http://github.com/dkdud8140/프로젝트.git
* github.com 의 생성한 repository


## local 프로젝트
* C:/bizworks/javaworks

## local 저장소
* local 프로젝트를 local 저장소로 설정


## 깃허브 저장소 생성
1. http://github.com/dkdud8140 접속
2. github 로그인
3. New repository 생성
4. Biz_403_2021_03_Java 이름 지정하고 create

## local 저장소 설정(생성)
* local 프로젝트 폴더를 로컬 저장소로 설정하기
1. C:/bizworks/javaworks 폴더에서 git bash 실행
	- bash shell 화면 나타남 : 윈도우의 cmd 창과 유사

2. 로컬 저장소 선언
	- git init

3. 로컬 저장소를 github 계정과 연결
	- git config --local user.name dkdud8140
	- git config --local user.email cho.ay4@gmail.com

4. local 프로젝트 압축 준비
	- 압축 금지 파일 설정 : .gitignore 파일에 설정
	- touch .gitignore 로 파일 생성
	- .gitignore 파일을 서브라임 텍스트로 열어서 압축금지 파일 정보 등록

5. 로컬 프로젝트 압축하여 로컬 저장소에 옮길 준비하기
	- git add .

6. 로컬 저장소에 옮겨라
	- git commit -m "comment"

7. 로컬 저장소에 있는 파일들을 원격저장소로 업로드 하라
	- git push http://github.com/dkdud8140/Biz_403_2021_03_Java.git master



## 원격저장소와 연결된 프로젝트에 새로운 코드 추가하기
* git add .
* git commit -m "Hello_02추가"
* git push http://github.com/dkdud8140/Biz_403_2021_03_Java.git master






