package edu.switchtwo;

public class SwitchSecond0127 {

	public static void main(String[] args) {
//		whoIsIt("호랑이");
//		whoIsIt("사자");
//		whoIsIt("독수리");
//		whoIsIt("독수리");
//		whoIsIt("참새");
//		whoIsIt("고등어");
//		whoIsIt("곰팡이");
		String tmp = null;
		tmp = fone(1);
		System.out.println("tmp=" + tmp);
		tmp = fone(2);
		System.out.println("tmp=" + tmp);
		tmp = fone(3);
		System.out.println("tmp=" + tmp);
	}// end of main()

	static String fone(int n) {
		return switch (n) {
		case 1 -> "한개";
		case 2 -> "두개";
		default -> "많이";
		};

	}

//	static void whoIsIt(String bio) {
//		String kind = switch (bio) {
//		case "호랑이", "사자" -> "포유류";
//
//		case "독수리", "참새" -> "조류";
//
//		case "고등어", "연어" -> "어류";
//
//		default -> {
//			System.out.print("어이쿠! ");
//			yield "...";
//		}
//		}; // end of switch()
//
//		System.out.printf("%s는 %s이다\n", bio, kind);
//	}
//
//	static void whoIsIt(String bio) {
//		String kind = switch (bio) {
//		case "호랑이", "사자" -> "포유류";
//
//		case "독수리", "참새" -> "조류";
//
//		case "고등어", "연어" -> "어류";
//
//		default -> {
//			System.out.print("어이쿠! ");
//			yield "...";
//		}
//		}; // end of switch()
//
//		System.out.printf("%s는 %s이다\n", bio, kind);
//	}

	/*
	 * static void whoIsIt(String bio) { String kind = ""; switch (bio) { case
	 * "호랑이", "사자" -> kind = "포유류";
	 * 
	 * case "독수리", "참새" -> kind = "조류";
	 * 
	 * case "고등어", "연어" -> kind = "어류";
	 * 
	 * default -> { System.out.print("어이쿠! "); kind = "..."; } // 분류하기 어려운 것 }// end
	 * of switch()
	 * 
	 * System.out.printf("%s는 %s이다\n", bio, kind); }
	 */

	/*
	 * static void whoIsIt(String bio) { String kind = ""; switch (bio) { case
	 * "호랑이": // kind = "포유류"; // break; case "사자": kind = "포유류"; break; case "독수리":
	 * // kind = "조류"; // break; case "참새": kind = "조류"; break; case "고등어": kind =
	 * "어류"; break; case "연어": kind = "어류"; break; default:
	 * System.out.print("어이쿠! "); kind = "..."; // 분류하기 어려운 것 }// end of switch()
	 * 
	 * System.out.printf("%s는 %s이다\n", bio, kind); }//end of whoIsIt()
	 */
}
