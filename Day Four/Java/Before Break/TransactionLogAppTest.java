import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionLogAppTest {

    @Test
    public void testThatIfAUserDepositedAnyAmountTheAmountShouldBeDepositedAndAddToThePreviousBalanceSoThatTheAccountBalanceGrowsBiggerAndHappierWithoutAnyMistakeOrConfusionForeverAndEverAmen() {
        double initialBalance = 0;
        double depositAmount = 500;
        double expectedBalance = 500;

        double actualBalance = TransactionLogApp1.deposit(depositAmount, initialBalance);

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testThatWhenAnAccountOwnerDecidesToTakeOutSomeMoneyUsingWithdrawalTheRequestedAmountIsDeductedAccuratelyFromTheTotalBalanceWithoutCausingAnyTragedyOrHearrrtBreakToTheUserAtAll() {
        double initialBalance = 2000;
        double withdrawAmount = 500;
        double expectedBalance = 1500;

        double actualBalance = TransactionLogApp1.withdraw(withdrawAmount, initialBalance);

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testThatCheckingTheBalanceDirectlyReturnsTheExactCurrentAmountSavedInsideTheAccountWithoutHidingAnySecretsOrFailingTheUserExpectationAtAnyGivenTimeInTheApp() {
        double currentBalance = 1250;
        double expectedBalance = 1250;

        assertEquals(expectedBalance, currentBalance);
    }

    @Test
    public void testThatShowingTransactionsWillProperlyDisplayAllTheRecordsOfDepositsAndWithdrawalsDoneSoFar() {
        double[] deposits = new double[100];
        double[] withdrawals = new double[100];

        double depositAmount = 500.0;
        double withdrawAmount = 200.0;

        deposits[0] = depositAmount;
        withdrawals[0] = withdrawAmount;

        int expectedDepositCount = 1;
        int expectedWithdrawalCount = 1;
        double expectedDepositAmount = 500.0;
        double expectedWithdrawalAmount = 200.0;

        assertEquals(expectedDepositCount, 1);
        assertEquals(expectedWithdrawalCount, 1);
        assertEquals(expectedDepositAmount, deposits[0]);
        assertEquals(expectedWithdrawalAmount, withdrawals[0]);
    }
}
