package pratice.domain.jpa;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter@Setter @Builder
@ToString@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bno;

    private String btitle;

    private String bcontent;

    private String bwriter;


}
