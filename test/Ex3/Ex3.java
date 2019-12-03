class Ex3{

	public String ex3_0(final int n) {
		String ret = "";
		if (n > 0) {
			ret = "その値は正です";
		} else {
			ret = "その値は０か負です";
		}
		return ret;
	}

	public int ex3_1(final int n) {
	    if (n > 0) {
			return n;
		} else {
		return -1 * n;
		}
	}

	public String ex3_2(final int a, final int b) {
	    if (a % b == 0) {
			return String.format("%sは%sの約数です", b, a);
			} else {
			return String.format("%sは%sの約数ではありません", b, a);
			}
		}

	public String ex3_3(final int a, final int b) {
		if (a > b) {
			return String.format("%sのほうが大きいです", a);
		} else if (a < b) {
			return String.format("%sのほうが大きいです", b);
		} else {
			return "同じ値です";
		}
	}

	public String ex3_4(final int a) {
		if (a > 0 && a % 5 == 0) {
			return "その値は5では割り切れます";
		} else if (a > 0 && a % 5 != 0) {
		return "その値は5では割り切れません";
		} else {
			return "正ではない整数値です";
		}
	}

	public String ex3_5(final int a){
		if (a > 0 && a % 10 == 0) {
			return "その値は10の倍数です";
		} else if (a > 0 && a % 10 != 0) {
			return "その値は10の倍数ではありません";
		} else {
			return "正ではない整数値です";
		}
	}

	public String ex3_6(final int a) {
	    if (a > 0 && a % 3 == 0) {
			return "その値は3で割り切れます";
		} else if (a > 0 && a % 3 == 1) {
			return "その値を3で割った余りは1です"; 
		} else if (a > 0 && a % 3 == 2) {
			return "その値を3で割った余りは2です";
		} else {
			return "正でない整数値です";
		}
	}

	public String ex3_7(final int a) {
		if (a >= 0 && a <= 59) {
			return "不可";
		} else if (a >= 60 && a <= 69) {
			return "可";
		} else if (a >= 70 && a <= 79) {
			return "良";
		} else {
			return "優";
		}
    }
	public double ex3_8(final double a, final double b) {
		if (a >b) {
			return a;
		} else {
			return b;
		}
	}

	public int ex3_9(final int a, final int b) {
	    if (a > b) {
			return a + (b * -1);
			} else {
			return b + (a * -1);
			}
		}
	

	public String ex3_10(final int a, final int b) {
	    int c = a - b;
	    if (c <= 10) {
		return "それらの差は10以下です";
	    } else {
		return "それらの差は11以上です";
	    }
	}

	public int ex3_11(final int a, final int b, final int c) {
		if (c < Math.min(a, b)) {
			return c;
			} else {
			return Math.min(a, b);
			}
		}

	public int ex3_12(final int a, final int b, final int c) {
		if (a >= b) {
            if (b >= c) {
                return b; 
            } else if (a <= c) {
                return a; 
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }


	public String ex3_13(final int a) {
	    if (a > 0 && (a <= 2 || a  == 12)) {
			return "冬";
			} else if (a > 0 && a >= 3 && a <= 5) {
			return "春"; 
			} else if (a > 0 && a >= 6 && a <= 8) {
			return "夏";
			} else if (a > 0 && a >= 9 && a <= 11) {
			return "秋";
			} else {
			return "範囲(1～12)外の値です";
			}
		}
}

