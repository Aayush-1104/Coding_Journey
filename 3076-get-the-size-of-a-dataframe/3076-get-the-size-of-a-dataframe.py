import pandas as pd


def getDataframeSize(players: pd.DataFrame) -> List[int]:
    # num_rows=len(players)
    # num_columns=len(players.columns)
    # return [num_rows,num_columns]
    
    return list(players.shape)