package sample_cobertura

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
      given:
        def book = new Book(status:"ACTIVE")
      when:
        book.save()
      then:
        book.id != null
    }
}
