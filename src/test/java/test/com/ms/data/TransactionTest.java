package test.com.ms.data;

import com.ms.data.ACTPrivateKey;
import com.ms.data.CONTRACT;
import com.ms.data.Transaction;
import org.junit.Test;

public class TransactionTest {

    @Test
    public void testTransfer() {
        Transaction trx = new Transaction(
                new ACTPrivateKey("5KE8GLrGoCsCKS7PQiyFcGQkMncVCYw9r6TKwBreHvFRdFWDX9p"),
                10000L,
                "ACTZqXZtWHXhwzovD5ee3t6Texg1BUNCzYy",
                ""
        );
        System.out.println(trx.toJSONString());
    }

    @Test
    public void testContractTransfer() {
        Transaction trx = new Transaction(
                new ACTPrivateKey("5Jjxz2UYLfBoWkPgs2tDnC2XPEVfdxyFzACZoYWC7EXPyXG7z3P"),
                CONTRACT.SMC_t,
                "ACT3hzHVhrekqbhdGrC9quUW28nU4r2gBuGm",
                1L,
                1000L
        );
        System.out.println(trx.toJSONString());
    }

    @Test
    public void testContractTransferAll() {
        Transaction trx = new Transaction(
                new ACTPrivateKey("5Jjxz2UYLfBoWkPgs2tDnC2XPEVfdxyFzACZoYWC7EXPyXG7z3P"),
                "",
                "ACT3hzHVhrekqbhdGrC9quUW28nU4r2gBuGm",
                "1",
                1000L
        );
        System.out.println(trx.toJSONString());
    }

    @Test
    public void testContractTransaction() {
        Transaction trx = new Transaction(
                new ACTPrivateKey("5JqhMnPsyNpCVDSU79Xa3reoqR2kYWJNAKLNwYkpF7puiwk9e3D"),
                "CONE8Jjh6bA1J5AcDhFrSNv7faH5aSYWin7k",
                10000L,
                1000L
        );
        System.out.println(trx.toJSONString());
    }

    @Test
    public void test12345() {
        Transaction trx = new Transaction(
                new ACTPrivateKey("5KE8GLrGoCsCKS7PQiyFcGQkMncVCYw9r6TKwBreHvFRdFWDX9p"),
                        "CONEdGFaNVwCQuAZre9AfCaazNEnv6vEfuqh",
                        "mating_transfer",
                        "77|rOiL8RqCDMNOjJ3BvpwWR7EX534wr4XyJjyb2ZSduFRtcFBJvDu/H9Jz4lNxLIhf59I49aY6rQh2U6EPH4yNRdWqo3jpoar77jwzC04dFfj7muU4GrDGS6i3bY4jlWFxMba7i9HRBnhMFcwvOfu/vA==|101|1pwMzGNaMjIPMRodjQ4spwUxFOhRCibv0EkwTXkOSe0zpf4n8wy13WzwaqHb4/41vCJuZc3wdWU34a8I5c4CMTehzU9QZsTNq+R4onfLUSCUV5GXd8xqTwW7lOYCwxmuXTbNNwMj30by60LjNXDaxg==|180|lQKdgRNyQvaQQ9lKisUYYyVN+tGQ3lQ8KezU2F+P4PX9q5yG8O1kwpC8S7AqjUt3y7FJOOfwNheJ3xgkdzHItk7LwSc8DIVYGoPc0iVsxbGUV5GXd8xqTwW7lOYCwxmuXTbNNwMj30by60LjNXDaxg==|1514446878150|3.99911",
                        5000L,
                        true
        );
        System.out.println(trx.toJSONString());
    }
}
