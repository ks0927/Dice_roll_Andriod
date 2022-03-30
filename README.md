# Dice_roll_Andriod
주사위를 굴려보는 간단한 안드로이드 어플

3월 30일 study: Element : 데이터바인딩, Log, Random...etc

    데이터바인딩-- findViewById대신 사용할수있다
    build.gradle에 dataBinding{ enabled = true }적기 , layout으로 감싸주기
    MainActivity로 와서 private lateinit var binding : ActivityMainBinding 생성후
    binding =DataBindingUtil.setContentView(this,R.layout.activity_main)로 import해줌
    
    버튼색상이 안바뀜 -> themes에서 Theme.AppCompat.Light로 변경
    
    Log.d(~,~)로 로그를 찍어볼수있고 logcat에서 확인가능
    Log에는 e 오류, w 경고, i 정보, d 디버그, v 상세 5가지가 존재한다.