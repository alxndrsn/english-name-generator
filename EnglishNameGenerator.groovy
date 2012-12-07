def p = 'and marc son bert wick ness ton shire step ley ing sley'.split()
def q = 'Lord Lady Viscount Baronet Marquis Sir Captain Admiral'.split()
println q[new Random().nextInt(q.size())] + ' ' + (0..2).collect { p[new Random().nextInt(p.size())] }.join('').capitalize() + ' ' + (0..7).collect { p[new Random().nextInt(p.size())] }.join('').capitalize()
