package org.apache.pulsar.common.api.proto;
public enum ServerError {
	UnknownError(0), MetadataError(1), PersistenceError(2), AuthenticationError(3), AuthorizationError(4), ConsumerBusy(
			5), ServiceNotReady(6), ProducerBlockedQuotaExceededError(7), ProducerBlockedQuotaExceededException(
					8), ChecksumError(9), UnsupportedVersionError(10), TopicNotFound(11), SubscriptionNotFound(
							12), ConsumerNotFound(13), TooManyRequests(14), TopicTerminatedError(
									15), ProducerBusy(16), InvalidTopicName(17), IncompatibleSchema(
											18), ConsumerAssignError(19), TransactionCoordinatorNotFound(
													20), InvalidTxnStatus(21), NotAllowedError(22), TransactionConflict(
															23), TransactionNotFound(24), ProducerFenced(25),;
	private final int value;
	private ServerError(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static ServerError valueOf(int n) {
		switch (n) {
			case 0 :
				return UnknownError;
			case 1 :
				return MetadataError;
			case 2 :
				return PersistenceError;
			case 3 :
				return AuthenticationError;
			case 4 :
				return AuthorizationError;
			case 5 :
				return ConsumerBusy;
			case 6 :
				return ServiceNotReady;
			case 7 :
				return ProducerBlockedQuotaExceededError;
			case 8 :
				return ProducerBlockedQuotaExceededException;
			case 9 :
				return ChecksumError;
			case 10 :
				return UnsupportedVersionError;
			case 11 :
				return TopicNotFound;
			case 12 :
				return SubscriptionNotFound;
			case 13 :
				return ConsumerNotFound;
			case 14 :
				return TooManyRequests;
			case 15 :
				return TopicTerminatedError;
			case 16 :
				return ProducerBusy;
			case 17 :
				return InvalidTopicName;
			case 18 :
				return IncompatibleSchema;
			case 19 :
				return ConsumerAssignError;
			case 20 :
				return TransactionCoordinatorNotFound;
			case 21 :
				return InvalidTxnStatus;
			case 22 :
				return NotAllowedError;
			case 23 :
				return TransactionConflict;
			case 24 :
				return TransactionNotFound;
			case 25 :
				return ProducerFenced;
			default :
				return null;

		}
	}
	public static final int UnknownError_VALUE = 0;
	public static final int MetadataError_VALUE = 1;
	public static final int PersistenceError_VALUE = 2;
	public static final int AuthenticationError_VALUE = 3;
	public static final int AuthorizationError_VALUE = 4;
	public static final int ConsumerBusy_VALUE = 5;
	public static final int ServiceNotReady_VALUE = 6;
	public static final int ProducerBlockedQuotaExceededError_VALUE = 7;
	public static final int ProducerBlockedQuotaExceededException_VALUE = 8;
	public static final int ChecksumError_VALUE = 9;
	public static final int UnsupportedVersionError_VALUE = 10;
	public static final int TopicNotFound_VALUE = 11;
	public static final int SubscriptionNotFound_VALUE = 12;
	public static final int ConsumerNotFound_VALUE = 13;
	public static final int TooManyRequests_VALUE = 14;
	public static final int TopicTerminatedError_VALUE = 15;
	public static final int ProducerBusy_VALUE = 16;
	public static final int InvalidTopicName_VALUE = 17;
	public static final int IncompatibleSchema_VALUE = 18;
	public static final int ConsumerAssignError_VALUE = 19;
	public static final int TransactionCoordinatorNotFound_VALUE = 20;
	public static final int InvalidTxnStatus_VALUE = 21;
	public static final int NotAllowedError_VALUE = 22;
	public static final int TransactionConflict_VALUE = 23;
	public static final int TransactionNotFound_VALUE = 24;
	public static final int ProducerFenced_VALUE = 25;
}
