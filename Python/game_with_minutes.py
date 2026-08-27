initial_hours,initial_minutes,final_hours,final_minutes = map(int,input().split())
if initial_hours == final_hours and initial_minutes == final_minutes:
    print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
else:

    minutes_final = final_hours * 60 + final_minutes
    minutes_begin = initial_hours *60 + initial_minutes

    if minutes_final > minutes_begin:
        duration_time = minutes_final - minutes_begin
        final_hours = duration_time // 60
        final_minutes = duration_time % 60
    else:
        duration_time = (24 * 60 - minutes_begin) + minutes_final
        final_hours = duration_time // 60
        final_minutes = duration_time % 60

    print(f"O JOGO DUROU {final_hours} HORA(S) E {final_minutes} MINUTO(S)")
    