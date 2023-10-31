package racingcar

import camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest
import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ApplicationTest : NsTest() {
    @Test
    fun `전진 정지`() {
        assertRandomNumberInRangeTest(
            {
                run("pobi,woni", "1")
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi")
            }, MOVING_FORWARD, STOP
        )
    }

    @Test
    fun `이름에 대한 예외 처리`() {
        assertSimpleTest {
            assertThrows<IllegalArgumentException> { runException("pobi,javaji", "1") }
        }
    }

    @Test
    fun `입력값 없는 경우 예외 처리`() {
        assertSimpleTest {
            assertThrows<IllegalArgumentException> { runException("", "") }
        }
    }

    @Test
    fun `이름에 대한 중복 예외 처리`() {
        val invalidNames = "car1,car2,car1"
        val count = "3"

        assertSimpleTest {
            assertThrows<IllegalArgumentException> { runException(invalidNames, count) }
        }
    }

    @Test
    fun `시도 횟수가 음수인 경우 예외 처리`() {
        val validNames = "car1,car2,car3"
        val count = "-1"

        assertSimpleTest {
            assertThrows<IllegalArgumentException> { runException(validNames, count) }
        }
    }

    public override fun runMain() {
        main()
    }

    companion object {
        private const val MOVING_FORWARD = 4
        private const val STOP = 3
    }
}
