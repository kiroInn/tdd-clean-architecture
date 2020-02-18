package study.huhao.demo.domain.contexts.usercontext.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import study.huhao.demo.domain.contexts.blogcontext.blog.exceptions.NoNeedToPublishException;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserTest {

    @Nested
    class constructor {

        @Test
        void should_initialize_correctly() {
            UUID userId = UUID.randomUUID();
            User user = new User(userId, "Kiro", "Kiro Li", "Kiro", "emmm", "11@11.com");

            assertThat(user.getId()).isNotNull();
            assertThat(user.getName()).isEqualTo("Kiro");
            assertThat(user.getUserName()).isEqualTo("Kiro Li");
            assertThat(user.getDisplayName()).isEqualTo("Kiro");
            assertThat(user.getSignature()).isEqualTo("emmm");
            assertThat(user.getEmail()).isEqualTo("11@11.com");
        }

    }

    @Nested
    class save {

        private User user;

        @BeforeEach
        void setUp() {
            user = new User(UUID.randomUUID(), "Kiro", "Kiro Li", "Kiro", "emmm", "11@11.com");
        }

        @Test
        void should_save_correctly() throws InterruptedException {
            Thread.sleep(1);

            user.save("Kiro");

            assertThat(user.getName()).isEqualTo("Kiro");
        }
    }
}
