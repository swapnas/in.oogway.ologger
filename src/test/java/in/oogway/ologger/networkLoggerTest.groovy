package in.oogway.ologger

/**
 * Created by swapnas on 7/25/17.
 */
class networkLoggerTest extends spock.lang.Specification {

    def "test setLevel"() {
        def network = new networkLogger()
        Level l
        given:
        l=Level.CRITICAL

        when:
        network.setLevel(l)
        then:
        network.level==l

    }
}