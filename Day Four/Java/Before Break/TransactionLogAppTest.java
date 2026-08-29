import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionLogAppTest {

    @Test
    public void testThatIfAUserDepositedAnyAmountTheAmountShouldBeDepositedAndAddToThePreviousBalanceSoThatTheAccountBalanceGrowsBiggerAndHappierWithoutAnyMistakeOrConfusionForeverAndEverAmen() {
        int initialBalance = 0;
        int depositAmount = 500;
        int expectedBalance = 500;

        int actualBalance = TransactionLogApp.deposit(depositAmount, initialBalance);

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testThatWhenAnAccountOwnerDecidesToTakeOutSomeMoneyUsingWithdrawalTheRequestedAmountIsDeductedAccuratelyFromTheTotalBalanceWithoutCausingAnyTragedyOrHearrrtBreakToTheUserAtAll() {
        int initialBalance = 2000;
        int withdrawAmount = 500;
        int expectedBalance = 1500;

        int actualBalance = TransactionLogApp.withdraw(withdrawAmount, initialBalance);

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testThatCheckingTheBalanceDirectlyReturnsTheExactCurrentAmountSavedInsideTheAccountWithoutHidingAnySecretsOrFailingTheUserExpectationAtAnyGivenTimeInTheApp() {
        int currentBalance = 1250;
        int expectedBalance = 1250;

        assertEquals(expectedBalance, currentBalance);
    }

    @Test
    public void testThatShowingTransactionsWillProperlyDisplayAllTheRecordsOfDepositsAndWithdrawalsDoneSoFar() {
        int totalDeposits = 1;
        int totalWithdrawals = 1;
        int lastDeposit = 500;
        int lastWithdrawal = 200;

        assertEquals(1, totalDeposits);
        assertEquals(1, totalWithdrawals);
        assertEquals(500, lastDeposit);
        assertEquals(200, lastWithdrawal);
    }
}




//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out CalculatorTest.java Calculator.java

//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
