package fudan.se.lab2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @author LBW
 */
@Entity
public class Authority implements GrantedAuthority {

    private static final long serialVersionUID = -8974777274465208640L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String authority;

    @ManyToMany(mappedBy = "authorities")
    @JsonIgnore
    private Set<UserAndConference> userAndConference;

    public Authority() {
    }

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public void setUserAndConference(Set<UserAndConference> userAndConference) {
        this.userAndConference = userAndConference;
    }

    public Set<UserAndConference> getUserAndConference() {
        return userAndConference;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id + '\'' +
                ", authority=" + authority +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o != null)
            return this.toString().equals(o.toString());
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
