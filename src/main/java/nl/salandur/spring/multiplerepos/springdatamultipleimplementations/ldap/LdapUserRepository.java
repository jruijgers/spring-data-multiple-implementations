package nl.salandur.spring.multiplerepos.springdatamultipleimplementations.ldap;

import org.springframework.data.ldap.repository.LdapRepository;

public interface LdapUserRepository extends LdapRepository<LdapUser> {
}
