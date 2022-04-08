import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InMemoryMemberRepositoryTest {
    private InMemoryMemberRepository inMemoryMemberRepository;

    @BeforeEach
    void setUp() {
        this.inMemoryMemberRepository = new InMemoryMemberRepository();
    }

    @Test
    void saveAndFindAllTest() {
        inMemoryMemberRepository.save(new Member("member1"));

        List<Member> members = inMemoryMemberRepository.findAll();
        assertThat(members).hasSize(1);
    }
}
