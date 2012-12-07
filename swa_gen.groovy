class SwahiliGenerator {
	def r = new Random()

	def word = {
	    def p = 'ka ku m i mw na ni ta tu wa wi me mi si shi pa pe li la lei'.split()
	    (0..(1 + r.nextInt(5))).collect { p[r.nextInt(p.size())] }.join('') + ' '
	}

	def sentence = {
	    def sen = ''
	    (1 + r.nextInt(5)).times {
		sen += word()
	    }
	    return sen[0..-2] + ", sindio?"
	}
}

println new SwahiliGenerator().sentence()
