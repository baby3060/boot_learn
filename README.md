# boot_learn

## Main 클래스
애노테이션 @SpringBootApplication은 
<pre>
    <code>
        @Configuration 
        @EnableAutoConfiguration 
        @ComponentScan
    </code>
</pre>
와 동일

아니면
<pre>
    <code>
        @Configuration
        @EnableAutoConfiguration
        @Import({ MyConfig.class, MyAnotherConfig.class })
    </code>
</pre>

이와 같이 사용 가능(ComponentScan 대신 Import 사용)

## Test 클래스

스프링 부트 사용 시 test 스타터에 자동으로 hamcrest가 포함되어 있음.