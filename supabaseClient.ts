import { createClient } from '@supabase/supabase-js';

const supabaseKey = process.env.SUPABASE

export const supabase = createClient(supabaseUrl, supabaseKey);
