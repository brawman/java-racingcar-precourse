# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)



## 기능 요구사항

- [ ] 주어진횟수동안n대의자동차는전진또는멈출수있다.
- [ ] 각자동차에이름을부여할수있다.전진하는자동차를출력할때자동차이름을같이출력한다.
- [ ] 자동차이름은쉼표(,)를기준으로구분하며이름은5자이하만가능하다.
- [ ] 사용자는몇번의이동을할것인지를입력할수있어야한다.
- [ ] 전진하는조건은0에서9사이에서random값을구한후random값이4이상일경우전진하고,3이 하의값이면멈춘다.
- [ ] 자동차경주게임을완료한후누가우승했는지를알려준다.
- [ ] 우승자가한명이상일경우,쉼표(,)로이름을구분해출력한다.
- [ ] 사용자가잘못된값을입력할경우“[ERROR]”로시작하는에러메시지를출력후입력을다시받는다.

## 기능

### 자동차

- [x] 이름은 5자 이하
- [x] 전진
- [x] 이동 거리 비교

### 자동차 생성

- [x] 자동차 이름을 쉼표로 구분해서 자동차 생성

### 자동차 이동

- [x] 4 ~ 9의 값일 경우 자동차 이동

### 자동차 단체 이동

- [x] 자동차 단체에 대해서 이동 또는 정지

### 우승자 뽑기

- [x] 가장 많이 이동한 자동차를 우승자로 선정
