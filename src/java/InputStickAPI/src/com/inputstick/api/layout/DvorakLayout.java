package com.inputstick.api.layout;

public class DvorakLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = "en-DV";
	
	public static final int LUT[][] = {
		/*	0	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	1	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	2	*/	{	0	,	(int)'1'	,	0x021	,	-1		,	-1	,	-1	}	,
		/*	3	*/	{	0	,	(int)'2'	,	0x040	,	-1		,	-1	,	-1	}	,
		/*	4	*/	{	0	,	(int)'3'	,	0x023	,	-1		,	-1	,	-1	}	,
		/*	5	*/	{	0	,	(int)'4'	,	0x024	,	-1		,	-1	,	-1	}	,
		/*	6	*/	{	0	,	(int)'5'	,	0x025	,	-1		,	-1	,	-1	}	,
		/*	7	*/	{	0	,	(int)'6'	,	0x05e	,	-1		,	-1	,	-1	}	,
		/*	8	*/	{	0	,	(int)'7'	,	0x026	,	-1		,	-1	,	-1	}	,
		/*	9	*/	{	0	,	(int)'8'	,	0x02a	,	-1		,	-1	,	-1	}	,
		/*	0a	*/	{	0	,	(int)'9'	,	0x028	,	-1		,	-1	,	-1	}	,
		/*	0b	*/	{	0	,	(int)'0'	,	0x029	,	-1		,	-1	,	-1	}	,
		/*	0c	*/	{	0	,	0x05b		,	0x07b	,	0x01b	,	-1	,	-1	}	,
		/*	0d	*/	{	0	,	0x05d		,	0x07d	,	0x01d	,	-1	,	-1	}	,
		/*	0e	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	0f	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		
		/*	10	*/	{	0	,	0x027		,	0x022	,	-1		,	-1	,	-1	}	,
		/*	11	*/	{	0	,	0x02c		,	0x03c	,	-1		,	-1	,	-1	}	,
		/*	12	*/	{	0	,	0x02e		,	0x03e	,	-1		,	-1	,	-1	}	,
		/*	13	*/	{	1	,	'p'			,	'P'		,	-1		,	-1	,	-1	}	,
		/*	14	*/	{	1	,	'y'			,	'Y'		,	-1		,	-1	,	-1	}	,
		/*	15	*/	{	1	,	'f'			,	'F'		,	-1		,	-1	,	-1	}	,
		/*	16	*/	{	1	,	'g'			,	'G'		,	-1		,	-1	,	-1	}	,
		/*	17	*/	{	1	,	'c'			,	'C'		,	-1		,	-1	,	-1	}	,
		/*	18	*/	{	1	,	'r'			,	'R'		,	-1		,	-1	,	-1	}	,
		/*	19	*/	{	1	,	'l'			,	'L'		,	-1		,	-1	,	-1	}	,
		/*	1a	*/	{	0	,	0x02f		,	0x03f	,	-1		,	-1	,	-1	}	,
		/*	1b	*/	{	0	,	0x03d		,	0x02b	,	-1		,	-1	,	-1	}	,
		/*	1c	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	1d	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	1e	*/	{	1	,	'a'			,	'A'		,	-1		,	-1	,	-1	}	,
		/*	1f	*/	{	1	,	'o'			,	'O'		,	-1		,	-1	,	-1	}	,
		
		/*	20	*/	{	1	,	'e'			,	'E'		,	-1		,	-1	,	-1	}	,
		/*	21	*/	{	1	,	'u'			,	'U'		,	-1		,	-1	,	-1	}	,
		/*	22	*/	{	1	,	'i'			,	'I'		,	-1		,	-1	,	-1	}	,
		/*	23	*/	{	1	,	'd'			,	'D'		,	-1		,	-1	,	-1	}	,
		/*	24	*/	{	1	,	'h'			,	'H'		,	-1		,	-1	,	-1	}	,
		/*	25	*/	{	1	,	't'			,	'T'		,	-1		,	-1	,	-1	}	,
		/*	26	*/	{	1	,	'n'			,	'N'		,	-1		,	-1	,	-1	}	,
		/*	27	*/	{	1	,	's'			,	'S'		,	-1		,	-1	,	-1	}	,
		/*	28	*/	{	0	,	0x02d		,	0x05f	,	-1		,	-1	,	-1	}	,
		/*	29	*/	{	0	,	0x060		,	0x07e	,	-1		,	-1	,	-1	}	,
		/*	2a	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	2b	*/	{	0	,	0x005c		,	0x07c	,	0x01c	,	-1	,	-1	}	,
		/*	2c	*/	{	0	,	0x003b		,	0x03a	,	-1		,	-1	,	-1	}	,
		/*	2d	*/	{	1	,	'q'			,	'Q'		,	-1		,	-1	,	-1	}	,
		/*	2e	*/	{	1	,	'j'			,	'J'		,	-1		,	-1	,	-1	}	,
		/*	2f	*/	{	1	,	'k'			,	'K'		,	-1		,	-1	,	-1	}	,
		
		/*	30	*/	{	1	,	'x'			,	'X'		,	-1		,	-1	,	-1	}	,
		/*	31	*/	{	1	,	'b'			,	'B'		,	-1		,	-1	,	-1	}	,
		/*	32	*/	{	1	,	'm'			,	'M'		,	-1		,	-1	,	-1	}	,
		/*	33	*/	{	1	,	'w'			,	'W'		,	-1		,	-1	,	-1	}	,
		/*	34	*/	{	1	,	'v'			,	'V'		,	-1		,	-1	,	-1	}	,
		/*	35	*/	{	1	,	'z'			,	'Z'		,	-1		,	-1	,	-1	}	,
		/*	36	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	37	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	38	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	39	*/	{	0	,	0x020		,	0x020	,	0x020	,	-1	,	-1	}	,
		/*	3a	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	3b	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	3c	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	3d	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	3e	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,		
		/*	3f	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		
		
		/*	40	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	41	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	42	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	43	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	44	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	45	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	46	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	47	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	48	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	49	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	4a	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	4b	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	4c	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	4d	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	4e	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	4f	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		
		/*	50	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	51	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	52	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	53	*/	{	0	,	0x02e		,	0x02e	,	-1		,	-1	,	-1	}	,
		/*	54	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	55	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	56	*/	{	0	,	0x05c		,	0x07c	,	0x01c	,	-1	,	-1	}	,
		/*	57	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	58	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	59	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	5a	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	5b	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	5c	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	5d	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	5e	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		/*	5f	*/	{	-1	,	0			,	0		,	0		,	0	,	0	}	,
		
	};
	
	public static final int DEADKEYS[] = null;
	public static final int DEADKEY_LUT[][] = null;
	
	private static DvorakLayout instance = new DvorakLayout();
	
	private DvorakLayout() {
	}
	
	public static DvorakLayout getInstance() {
		return instance;
	}	

	@Override
	public int[][] getLUT() {
		return LUT;
	}

	@Override
	public void type(String text) {
		super.type(LUT, DEADKEY_LUT, DEADKEYS, text, (byte)0);
	}	
	
	@Override
	public void type(String text, byte modifiers) {
		super.type(LUT, DEADKEY_LUT, DEADKEYS, text, modifiers);
	}	
	
	@Override
	public char getChar(int scanCode, boolean capsLock, boolean shift, boolean altGr) {
		return super.getChar(LUT, scanCode, capsLock, shift, altGr);
	}	
	
	@Override
	public String getLocaleName() {		
		return LOCALE_NAME;
	}

	@Override
	public int[][] getDeadkeyLUT() {		
		return DEADKEY_LUT;
	}

	@Override
	public int[] getDeadkeys() {
		return DEADKEYS;
	}
	
}