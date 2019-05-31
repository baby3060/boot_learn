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