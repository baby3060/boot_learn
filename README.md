# boot_learn

## Main 클래스
애노테이션 @SpringBootApplication은 
<pre>
    <code>
        @Configuration
        @EnableAutoConfiguration
        @Import({ MyConfig.class, MyAnotherConfig.class })
    </code>
</pre>
와 동일