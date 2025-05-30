package agronova.yanapay.shared.infrastructure.redis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@ComponentScan("agronova.yanapay")
@EnableRedisRepositories(basePackages = "agronova.yanapay")
@PropertySource("classpath:application.properties")
public class RedisConfiguration {
    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new JedisConnectionFactory(); // Usa Lettuce o Jedis
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        return template;
    }
}
